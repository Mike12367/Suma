FROM java:latest

RUN git clone https://github.com/Mike12367/Suma.git


WORKDIR /Suma

RUN jdk install

CMD java 8 SumaMain.java

