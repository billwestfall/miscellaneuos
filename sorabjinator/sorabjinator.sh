#!/bin/bash

while true
do
  rm -f looper.alda
  ruby music_all_chords.rb >> looper.alda
  alda up; alda play -f looper.alda
  sleep 150
done
