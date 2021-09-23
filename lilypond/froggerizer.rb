#!/usr/bin/ruby

print "\\version \"2.18.2\""
print "\n"
print "\\paper {"
print "\n"
print "page-breaking = #ly:one-line-breaking"
print "\n"
print "}"
print "\n"
print "\\set midiInstrument = \#\"piano\""
print "\n"
key_sig = [ :"c \\major", :"g \\major", :"d \\major", :"a \\major", :"e \\major", :"b \\major", :"fis \\major", :"cis \\major", :"a \\minor", :"e \\minor", :"b \\minor", :"fis \\minor", :"cis \\minor", :"gis \\minor", :"dis \\minor", :"ais \\minor", :"f \\major", :"bes \\major", :"ees \\major", :"aes \\major", :"des \\major", :"ges \\major", :"ces \\major", :"d \\minor", :"g \\minor", :"c \\minor", :"f \\minor", :"bes \\minor", :"ees \\minor", :"aes \\minor" ].sample
print "topNotes ="
print "\n"
print "\\absolute {"
print "\n"
print "  \\time 4/4"
print "\n"
print "\\key "
print key_sig
print "\n"
print "  "
  $i = 0
    while $i < 100 do
      print "<"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:is, :es, ""].sample
      print [ :"'", :",", :"''", :",,", :"" ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:is, :es, ""].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:is, :es, ""].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:is, :es, ""].sample
#      print [ :"'", :"," ].sample
      print " "
      print ">"
      print [ :"4 ", :"8", :"16", :"32", :"64", :"128" ].sample
#      print " "
#      print "\\bar \"\" "
      $i +=1
    end
print "\n"
print "}"
print "\n"
print "\\set midiInstrument = \#\"piano\""
print "\n"
print "lowNotes ="
print "\n"
print "\\absolute {"
print "\n"
print "  \\time 4/4"
print "\n"
print "\\key "
print key_sig
print "\n"
print "  \\clef bass"
print "\n"
print "  "
  $i = 0
    while $i < 100 do
      print "<"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:is, :es, ""].sample
      print [ :"'", :",", :"''", :",,", :"" ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:is, :es, ""].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:is, :es, ""].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:is, :es, ""].sample
#      print [ :"'", :"," ].sample
      print " "
      print ">"
      print [ :"4 ", :"8", :"16", :"32", :"64", :"128" ].sample
#      print " "
#      print "\\bar \"\" "
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
print "\\layout { }"
print "\n"
print "\\midi {"
  print "\n"
  print "\\context {"
    print "\n"
    print "\\Staff"
    print "\n"
    print "\\remove \"Staff_performer\""
    print "\n"
  print "}"
  print "\n"
  print "\\context {"
    print "\n"
    print "\\Voice"
    print "\n"
    print "\\consists \"Staff_performer\""
    print "\n"
  print "}"
  print "\n"
  print "\\context {"
    print "\n"
    print "\\Score"
    print "\n"
    print "tempoWholesPerMinute = \#(ly:make-moment 72 2)"
    print "\n"
  print "}"
  print "\n"
print "}"
print "\n"
