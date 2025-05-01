#!/bin/bash

set -e
set -u
set -o pipefail
IFS=$'\n\t'

ENGLISH_ONLY='http://ftp.edrdg.org/pub/Nihongo/JMdict_e.gz'
ALL='http://ftp.edrdg.org/pub/Nihongo/JMdict.gz'

ftd=$ENGLISH_ONLY
#TODO: add args for all langs

name=`basename $ftd`

if [[ -e $name ]]; then
  rm -f $name
fi
curl $ftd > $name
gunzip -c $name > ../jmdict
