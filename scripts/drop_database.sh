#!/bin/sh

psql -c "DROP DATABASE IF EXISTS kangaroo;"
psql -c "DROP USER IF EXISTS kangaroo;"
