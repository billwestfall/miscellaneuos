#!/usr/bin/ruby

print "piano: (tempo! 40) "
  $i = 0
    while $i < 160 do
      print [ :o6, :o7, :o8, :o9, :o10, :<, :> ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print [ :/, :" " ].sample
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print [ :/, :" " ].sample
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print [ :/, :" " ].sample
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print [ :/, :" " ].sample
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print [ :/, :" " ].sample
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"2", :"4", :"" ].sample
      print " "
      $i +=1
    end
