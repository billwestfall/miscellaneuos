
#!/usr/bin/ruby

print "piano: (tempo! 10) "
  $i = 0
    while $i < 640 do
      print [ :o3, :o4, :o5, :o6, :o7, :<, :> ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :-, :+, :"", :"" ].sample
      print [ :"4", :"8", :"16", :"32", :"" ].sample
#      print [ :/, :" " ].sample
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
    print "midi-bright-acoustic-piano: (tempo! 10) "
      $i = 0
        while $i < 640 do
          print [ :o3, :o4, :o5, :o6, :o7, :<, :> ].sample
          print " "
          print [ :a, :b, :c, :d, :e, :f, :g, ].sample
          print [ :-, :+, :"", :"" ].sample
          print [ :"4", :"8", :"16", :"32", :"" ].sample
    #      print [ :/, :" " ].sample
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
        print "midi-string-ensemble-2: (tempo! 10) "
          $i = 0
            while $i < 640 do
              print [ :o2, :o3, :o4, :<, :> ].sample
              print " "
              print [ :a, :b, :c, :d, :e, :f, :g, ].sample
              print [ :-, :+, :"", :"" ].sample
              print [ :"4", :"8", :"16", :"32", :"" ].sample
        #      print [ :/, :" " ].sample
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
