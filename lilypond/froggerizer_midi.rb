#!/usr/bin/ruby

print "\\version \"2.19.22\""
print "\n"
print "\\include \"english.ly\""
print "\n"
print "\\header {"
print "\n"
print "title = \\markup { \"nocte cadit\" }"
print "\n"
print "composer = \"Bill Westfall\""
print "\n"
print "}"
print "\n"

print "\\paper {"
print "\n"
print "paper-height = 4.6\\in"
print "\n"
print "paper-width = 8.5\\in"
print "\n"
print "indent = #0"
print "\n"
print " system-count = #2"
print "\n"
print "}"
print "\n"

print "\\score {"
print "\n"
print "\\new PianoStaff = \"pianostaff\" <<"
print "\n"
print "\\new Staff = \"RH\" \\relative c\' {"
print "\n"
print "     \\set midiInstrument = #\"piano\""
print "\n"
print "     \\accidentalStyle Score.piano"
print "\n"
print "     \\clef \"treble\""
print "\n"
print "      \\time 4\/4"
print "\n"
print "      \\set Score.currentBarNumber = #1"
print "\n"
print "     \\tempo \"sequitur\" 4 = 20"
print "\n"
print "  "
  $i = 0
    while $i < 10 do
      print "<"
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:s, :f, ""].sample
      print [ :"'", :",", :"''", :",,", :"" ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:s, :f, ""].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:s, :f, ""].sample
#      print [ :"'", :"," ].sample
      print " "
      print [ :a, :b, :c, :d, :e, :f, :g, ].sample
      print [:s, :f, ""].sample
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

print "    \\new Staff = \"LH\" \\relative c, {"
print "     \\set midiInstrument = #\"piano\""
print "     \\clef \"bass\""
print "      \\time 4\/4"
      print "  "
        $i = 0
          while $i < 10 do
            print "<"
            print [ :a, :b, :c, :d, :e, :f, :g, ].sample
            print [:s, :f, ""].sample
            print [ :"'", :",", :"''", :",,", :"" ].sample
            print " "
            print [ :a, :b, :c, :d, :e, :f, :g, ].sample
            print [:s, :f, ""].sample
      #      print [ :"'", :"," ].sample
            print " "
            print [ :a, :b, :c, :d, :e, :f, :g, ].sample
            print [:s, :f, ""].sample
      #      print [ :"'", :"," ].sample
            print " "
            print [ :a, :b, :c, :d, :e, :f, :g, ].sample
            print [:s, :f, ""].sample
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
  print ">>"
  print "\n"
  print "\\layout { }"
  print "\n"
  print "\\midi {"
  print "\n"
  print " \\context {"
  print "\n"
  print "   \\Staff"
  print "\n"
  print "   \\remove \"Staff_performer\""
  print "\n"
  print "  }"
  print "\n"
  print " \\context {"
  print "\n"
  print "   \\Voice"
  print "\n"
  print "    \\consists \"Staff_performer\""
  print "\n"
  print " }"
  print "\n"
  print " \\context {"
  print "\n"
  print "   \\Score"
  print "\n"
  print "   tempoWholesPerMinute = #(ly:make-moment 20 2)"
  print "\n"
  print " }"
  print "\n"
  print "}"
  print "\n"
  print "}"
  print "\n"
