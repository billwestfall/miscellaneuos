#!/usr/bin/ruby

print "piano: (tempo! 60) "
  $i = 0
    while $i < 160 do
      print [ :o3, :o4, :o5, :o6, :<, :> ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print "/"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print "/"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print "/"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print "/"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print "/"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print " "
      $i +=1
    end
