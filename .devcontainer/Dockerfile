FROM clojure:temurin-21-alpine
RUN apk add git
RUN apk add rlwrap
RUN wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
RUN chmod a+x lein
RUN mv lein /usr/local/bin
RUN lein