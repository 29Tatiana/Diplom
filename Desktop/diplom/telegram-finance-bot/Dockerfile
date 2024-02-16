FROM python:3.8

WORKDIR /home

ENV TELEGRAM_API_TOKEN="6893185667:AAF-Wk8NqR16RbdhF6bVimargCVob_CSqOo"
ENV TELEGRAM_ACCESS_ID="464102549"

ENV TZ=Europe/Moscow
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN pip install -U pip aiogram pytz && apt-get update && apt-get install sqlite3
COPY *.py ./
COPY createdb.sql ./

ENTRYPOINT ["python", "server.py"]

