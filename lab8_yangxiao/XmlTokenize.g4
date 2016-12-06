lexer grammar XmlTokenize;

@lexer::members {
    String elname = "";
    boolean found = false;
}

fragment DIGIT: [0123456789];
fragment ALPHA: [a-zA-Z];
fragment SPECIAL: [-_~!$&'()*+,;=:];
fragment HYPHENS: '-';
fragment UNDERSCORES: '_';
fragment PERIOD: '.';

fragment LOCAL: ALPHA | DIGIT | SPECIAL;
fragment DOMAIN: ALPHA | DIGIT | HYPHENS | PERIOD;
fragment LOCALP: LOCAL+ (PERIOD LOCAL+)*;
fragment DOMAINP: DOMAIN+;

fragment ELEMENTF: ALPHA | UNDERSCORES;
fragment ELEMENT: ALPHA | DIGIT | HYPHENS | UNDERSCORES | PERIOD;

//Element tag start
START: '<' ELEMENTF ELEMENT+ '>'{
found = true;
String x = getText();
x = x.substring(1);
int len = x.length();
x = x.substring(0, len-1);
elname = x;
System.out.println("Element " + x + " FOUND!");
};

//Element tag end
END: '</' ELEMENTF ELEMENT+ '>' {
String x = getText();
x = x.substring(2);
int len = x.length();
x = x.substring(0, len-1);
System.out.println("Element " + x + " END!");
found = false;
};

//Email
EMAIL: (LOCALP '@' DOMAINP) {
String x = getText();
int pos = x.indexOf('@');
String test = x.substring(0, pos);
if(found)
{
System.out.println("Email: " + getText());
}
};

//Data element
fragment ONETONINE: [123456789];
fragment DAY: (ONETONINE) | ('1' ONETONINE) | ('2' ONETONINE) | ('3' ('0'|'1'));
fragment MONTH: (ONETONINE) | ('1'('0'|'1'|'2'));
fragment YEAR: ('20' DIGIT DIGIT) | ('2100');

DATE: DAY '/' MONTH '/' YEAR {
System.out.println("Date: " + getText());
};


//Phone number
fragment PHONE3: DIGIT DIGIT DIGIT;
fragment PHONE4: DIGIT DIGIT DIGIT DIGIT;
fragment SPACE: [ \s];

PHONENUM: ((PHONE3 ' ' PHONE3 ' ' PHONE4) | (PHONE3 '.' PHONE3 '.' PHONE4) | (PHONE3 '-' PHONE3 '-' PHONE4) | ('(' PHONE3 ')' PHONE3 '-' PHONE4))
{
System.out.println("Phone Number: " + getText());
};

//Credit card
fragment DIGIT15: PHONE4 PHONE4 PHONE4 PHONE3;
fragment DIGIT14: PHONE4 PHONE4 PHONE4 DIGIT DIGIT;
fragment DIGIT13: PHONE4 PHONE4 PHONE4 DIGIT;
fragment DIGIT12: PHONE4 PHONE4 PHONE4;
fragment DIGIT11: PHONE4 PHONE4 PHONE3;
fragment VISA: '4' (DIGIT15 | DIGIT12);
fragment MASTER: '5' [1-5] DIGIT14;
fragment AMEX: ('34' | '37') DIGIT13;
fragment DINERSCLUB: (('30' [0-5]) DIGIT11) | (('36' | '38') DIGIT12);
fragment DISCOVER: ('6011' DIGIT12) | ('65' DIGIT14);
fragment JCB: (('2131' | '1800') DIGIT11) | ('35' DIGIT14);

CREDITCARD: (VISA | MASTER | AMEX | DINERSCLUB | DISCOVER | JCB)  {System.out.println("Credit Card: " + getText());};

OTHEREL: (ALPHA | DIGIT | SPECIAL | SPACE)+ {
if(found && !elname.matches("(?i)email") && !elname.matches("(?i)phone") && !elname.matches("(?i)date") && !elname.matches("(?i)creditcard"))
{
System.out.println(elname + ": " + getText());}
else{
System.out.println("Error in " + elname + " element!");
}
};


BAD: PERIOD+ //.-_
            { System.out.println("Muti period in local part! Showing partial email!"); }
        ;


BAD2: SPECIAL+ //anyspecial
 { System.out.println("SP " + getText()); };

WS: [ \r\n\t]+         {skip();} ;
