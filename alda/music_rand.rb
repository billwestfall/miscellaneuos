#!/usr/bin/ruby

print "piano: (tempo 5) "
  $i = 0
    while $i < 640 do
      print [ :o0, :o1, :o2, :o3, :o4, :o5, :o6, :o7, :o8].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"+", :"-", :"", :"" ].sample
      print [ :"4", :"8", :"16", :"" ].sample
      print [ :"/", :"" ].sample
      print " "
      $i +=1
    end
print [ :a, :b, :c, :d, :e, :f, :g, ].sample
puts ""
puts ""
print "piano: (tempo 5) "
  $i = 0
    while $i < 640 do
      print [ :o0, :o1, :o2].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"+", :"-", :"", :"" ].sample
      print [ :"4", :"8", :"" ].sample
      print [ :"/", :"" ].sample
      print " "
      $i +=1
    end
print [ :a, :b, :c, :d, :e, :f, :g, ].sample
puts ""
puts ""
print "piano: (tempo 5) "
  $i = 0
    while $i < 640 do
      print [ :o0, :o1, :o2, :o3, :o4, :o5].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"+", :"-", :"", :"" ].sample
      print [ :"4", :"8", :"16", :"" ].sample
      print [ :"" ].sample
      print " "
      $i +=1
    end
