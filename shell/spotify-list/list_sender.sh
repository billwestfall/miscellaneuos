#!/bin/sh

new_number=$RANDOM
sleep 3
curl -X GET "https://api.spotify.com/v1/search?q=$new_number&type=album,artist,track,playlist" -H "Accept: application/json" -H "Authorization: Bearer <YOUR_SPOTIFY_KEY" > spot_out.txt
sleep 3
cat spot_out.txt | mail -s "Daily Spotify search" <YOUR_EMAIL>
