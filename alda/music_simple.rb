
#!/usr/bin/ruby

print "piano: (tempo! 40) "
  $i = 0
    while $i < 320 do
      print [ :o5, :o6, :o7, :o8, :o9, :<, :> ].sample
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
    print "celesta: (tempo! 40) "
      $i = 0
        while $i < 320 do
          print [ :o5, :o6, :o7, :o8, :o9, :<, :> ].sample
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
