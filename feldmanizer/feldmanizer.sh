#!/bin/bash

while true
do
  rm -f looper.alda
  ruby music_song_slow.rb >> looper.alda
  ./alda play -f looper.alda
  sleep 800
done
