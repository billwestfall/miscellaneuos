#!/usr/bin/ruby

print "\\version \"2.18.2\""
print "\n"
print "topNotes ="
print "\n"
print "\\absolute {"
print "\n"
print "  \\time 4/4"
print "\n"
print "  "
  $i = 0
    while $i < 80 do
      print "<"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"'", :",", :"''", :",,", :"" ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
#      print [ :"'", :"," ].sample
      print " "
      print ">"
      print [ :"1 ", :"2 ", :"4 " ].sample
      $i +=1
    end
print "\n"
print "}"
print "\n"
print "lowNotes ="
print "\n"
print "\\absolute {"
print "\n"
print "  \\time 4/4"
print "\n"
print "  \\clef bass"
print "\n"
print "  "
  $i = 0
    while $i < 80 do
      print "<"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [ :"'", :",", :"''", :",,", :"" ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
#      print [ :"'", :"," ].sample
      print " "
      print ">"
      print [ :"1 ", :"2 ", :"4 " ].sample
      $i +=1
    end
print "\n"
print "}"
print "\n"
print "<<"
print "\n"
print "  \\new Staff \\topNotes"
print "\n"
print "  \\new Staff \\lowNotes"
print "\n"
print ">>"
print "\n"
