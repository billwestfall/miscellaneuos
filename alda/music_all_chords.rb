
#!/usr/bin/ruby

print "piano: (tempo! 20) "
  $i = 0
    while $i < 640 do
      print [ :o2, :o3, :o4, :o5, :o6, :o7, :<, :> ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :-, :+, :"", :"" ].sample
      print [ :"4", :"8", :"16", :"32", :"" ].sample
      print " / "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :-, :+, :"", :"" ].sample
      print [ :"4", :"8", :"16", :"32", :"" ].sample
      print " / "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :-, :+, :"", :"" ].sample
      print [ :"4", :"8", :"16", :"32", :"" ].sample
      print " / "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :-, :+, :"", :"" ].sample
      print [ :"4", :"8", :"16", :"32", :"" ].sample
      print " / "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :-, :+, :"", :"" ].sample
      print [ :"4", :"8", :"16", :"32", :"" ].sample
      print " / "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :-, :+, :"", :"" ].sample
      print [ :"4", :"8", :"16", :"32", :"" ].sample
      print " "
      $i +=1
    end
