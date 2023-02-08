# hotel-alura-jc-g3
JAVA Hotel Project

# hotel-alura-jc-g3
JAVA Project: Hotel Alura

## Regular Expressions

**Email RegEx**
```java:
List<String> emails = new ArrayList();
//Valid emails
emails.add("user@domain.com");
emails.add("user-1@domain.co.in");
emails.add("user1@domain.com");
emails.add("user.name@domain.com");
emails.add("username@domain.com");
emails.add("user.name@domain.com");
emails.add("user-name@domain.com");
emails.add("user_name@domain.com");
emails.add("username@domain.co.in");
//Invalid emails
emails.add("user#@domain.co.in");
emails.add("user@domaincom");
emails.add("user#domain.com");
emails.add("username.@domain.com");
emails.add(".user.name@domain.com");
emails.add("user-name@domain.com.");
emails.add("username@.com");
emails.add("@yahoo.com");

String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

Pattern pattern = Pattern.compile(regex);

for(String email : emails){
    Matcher matcher = pattern.matcher(email);
    System.out.println(email +" : "+ matcher.matches());
    System.out.println("---------------------------");
}
```
**Phone RegEx**

*For this: (123)-456-7890*

```java:
String rgx = "\\(\\d{3}\\)\\-\\d{3}\\-\\d{4}";
String rgxInput = "String to test"; // textField.getText()

if(Pattern.matches(rgx, rgxInput)){
    //Do Something...
}else{
    //Do Something...
}
```

**Text RegEx**

*It only allows: aA to zZ, space and ( )*

```java:
String regx = "^[a-zA-Z\\''()\\s]+";
String rgxInput = "String to test"; // textField.getText()

if(Pattern.matches(regx, rgxInput) {
    //Do Something...
}else{
    //Do Something...
}
```

## SQL Database

## _Tables Booking and Guests_

![Entity_Relation_1](https://user-images.githubusercontent.com/110748896/217424467-64a1573c-4b8c-43ca-8ace-1b722bb0267d.png)

## _Tables Users and User Type_

![Entity_Relation_2](https://user-images.githubusercontent.com/110748896/217424698-03d666ea-967f-4978-931f-083606fc5b37.png)

### _Example BINARY:_ to compare characters, uppercase, lowercase, etc.

```sql:
SELECT * FROM users WHERE user_name = BINARY 'user@0';
SELECT * FROM users WHERE user_name = BINARY 'User@0';
```

### _Example SHA1:_ It returns the encrypted string (hash) or NULL if the string passed is an empty string.

```sql:
INSERT INTO users (user_name, user_pass) VALUES ('user_1', SHA1('user@0'));

SELECT user_name FROM users WHERE user_pass = SHA1('user@0');
```

# Previews

## Preview 1

https://user-images.githubusercontent.com/110748896/217424869-8b5834d9-1145-4220-b944-c9bedeec18eb.mp4

## Preview 2

https://user-images.githubusercontent.com/110748896/217424949-12e8986f-75a6-4046-80b7-1ca13efaaef7.mp4

## Preview 3

https://user-images.githubusercontent.com/110748896/217425038-9cb8d686-ed86-45e9-ba68-68fee393cf91.mp4

## Alternative Tabbed Table

https://user-images.githubusercontent.com/110748896/217425173-48b6f042-5f4f-47aa-bae7-e817bd846792.mp4

## Alternative Login using Enum

### Type: Employee and Client Authorized or Unauthorized.

https://user-images.githubusercontent.com/110748896/217425341-630f549f-3c4a-47e2-9cea-2eb44b0d32de.mp4

## Alternative Login Deactivating Users

### Status: 'active' or 'inactive'

https://user-images.githubusercontent.com/110748896/217425449-b9d71aa7-4285-41d2-9eac-03893af4b6dd.mp4
