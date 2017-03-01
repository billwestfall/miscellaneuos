
#!/usr/bin/ruby

print "piano: (tempo! 40) "
  $i = 0
    while $i < 640 do
      print [ :o4, :o5, :o6, :o7, :o8, :<, :> ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :-, :+, :"", :"" ].sample
      print [ :"4", :"8", :"16", :"32", :"" ].sample
#      print [ :/, :"" ].sample
#      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
#      print [ :-, :+, :"", :"" ].sample
#      print [ :"4", :"8", :"16", :"32", :"" ].sample
#      print [ :/, :"" ].sample
#      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
#      print [ :-, :+, :"", :"" ].sample
#      print [ :"4", :"8", :"16", :"32", :"" ].sample
      print " "
      $i +=1
    end

    puts ""
    puts ""
    print "midi-honky-tonk-piano: (tempo! 40) "
      $i = 0
        while $i < 640 do
          print [ :o4, :o5, :o6, :o7, :o8, :<, :> ].sample
          print " "
          print [ :a, :b, :c, :d, :e, :f, :g, ].sample
          print [ :-, :+, :"", :"" ].sample
          print [ :"4", :"8", :"16", :"32", :"" ].sample
    #      print [ :/, :"" ].sample
    #      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
    #      print [ :-, :+, :"", :"" ].sample
    #      print [ :"4", :"8", :"16", :"32", :"" ].sample
    #      print [ :/, :"" ].sample
    #      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
    #      print [ :-, :+, :"", :"" ].sample
    #      print [ :"4", :"8", :"16", :"32", :"" ].sample
          print " "
          $i +=1
        end
