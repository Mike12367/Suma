FROM java:latest

RUN 

WORKDIR /Suma

COPY . /Suma/

CMD [ "npm", "start" ]

