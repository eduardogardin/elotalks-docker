# elotalks-docker

### Demo repository used on my talk about docker

- Used [Spring initialzr](https://start.spring.io/) to generate a spring boot application

- Created a simple resource to expose on `/hello` and test docker container technology

- [Slides available here](https://goo.gl/iWFxKq)


#### Build maven application

`mvnw clean package`

#### Build docker image

`docker build -t dockerfile:${version}`

#### Run image

`docker run docker run -p 8080:8080 dockertalk:${version}`

#### Go to
`http://localhost:8080/hello`, then you should see "Hello Talks"