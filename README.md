=> intailly create data base
        CREATE TABLE user_details(
            ID NUMBER,
            NAME VARCHAR2(20),
            EMAIL VARCHAR2(50),
            AGE NUMBER,
            DOB DATE
        );
-above Query is for creating table(schema) in database
-take ID as Primary.
=>We need to create Sequence for auto generation of User ID . Sql Query is
      ex:-  create SEQUENCE user_id minvalue 1 start with 0001 cache 10;
