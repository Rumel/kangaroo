#!/bin/sh

psql -c "DROP DATABASE IF EXISTS kangaroo;"
psql -c "DROP USER IF EXISTS kangaroo;"
psql -c "CREATE USER kangaroo WITH PASSWORD 'password';"
psql -c "CREATE DATABASE kangaroo OWNER kangaroo;"
