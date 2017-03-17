
#!/usr/bin/ruby
$j = 0
while $j < 10
      print "<"
  $i = 0
    while $i < 10 do
      print rand( 10..100 )
      print " "
      print [ :"B", :"F" ].sample
      print " "
      print rand( 10..240 )
      print " "
      print rand( 1..15 )
      print " "
      $i +=1
    end
          print ">"
          puts ""
$j +=1
end
