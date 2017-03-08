#!/usr/bin/ruby

print "\\version \"2.19.22\""
print "\n"
\include "english.ly"
print "\n"
\header {
print "\n"
  title = \markup { "nocte cadit" }
print "\n"
  composer = "Bill Westfall"
print "\n"
}
print "\n"

\paper {
print "\n"
  paper-height = 4.6\in
print "\n"
  paper-width = 8.5\in
print "\n"
  indent = #0
print "\n"
  system-count = #2
print "\n"
}
print "\n"

\score {
print "\n"
  \\new PianoStaff = "pianostaff" \<\<
print "\n"
#    \\new Staff = \"RH\" \\relative c\' {
print "\n"
      \set midiInstrument = #"piano"
print "\n"
      \accidentalStyle Score.piano
print "\n"
      \clef "treble"
print "\n"
      \time 4/4
print "\n"
      \set Score.currentBarNumber = #1
print "\n"
      \tempo "sequitur" 4 = 60
print "\n"
print "  "
  $i = 0
    while $i < 10 do
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

    \new Staff = "LH" \relative c, {
      \set midiInstrument = #"piano"
      \clef "bass"
      \time 4/4
      print "  "
        $i = 0
          while $i < 10 do
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
  >>
  \layout { }
  \midi {
    \context {
      \Staff
      \remove "Staff_performer"
    }
    \context {
      \Voice
      \consists "Staff_performer"
    }
    \context {
      \Score
      tempoWholesPerMinute = #(ly:make-moment 72 2)
    }
  }
}
