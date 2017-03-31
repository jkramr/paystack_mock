FROM nginx
COPY proxy.conf /etc/nginx/conf.d/default.conf
COPY certs/cert.pem /etc/ssl/certs/myssl.crt
COPY certs/privkey.pem /etc/ssl/private/myssl.key