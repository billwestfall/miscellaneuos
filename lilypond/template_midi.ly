\version "2.19.22"

\include "english.ly"

\header {
  title = \markup { "nocte cadit" }
  composer = "Bill Westfall"
}

\paper {
  paper-height = 4.6\in
  paper-width = 8.5\in
  indent = #0
  system-count = #2
}

\score {
  \new PianoStaff = "pianostaff" <<
    \new Staff = "RH" \relative c' {
      \set midiInstrument = #"piano"
      \accidentalStyle Score.piano
      \clef "treble"
      \time 4/4
      \set Score.currentBarNumber = #1
      \tempo "sequitur" 4 = 60
      <e gs,>4  { cs16[ ds] } <e gs,>4
      <ds gs,>4  { e16[ ds] } <cs gs>4
      <cs gs>4  { ds16[ cs] } <c g>4
      <cs gs>4  { ds16[ e] } <es bs gs>4

      <e gs,>4  { cs16[ ds] } e16 f gs a
      <gs c,>8  { as16[ gs] }
      <es b>8 ~ <es b>16 ds b as

      b16 d8 bf32 f' g16 af bf c
      <df df,>16 ( c af ) <e' e,> ( ds b ) <g' g,> ( ds

      <gs gs,>16 ) d,16 f gs
      a16 e f b
      c16 d, ( f gs

      a16 b ) e, ( f
      gs16 b c ) f, (
      gs16 as b d )
    }

    \new Dynamics = "Dynamics_pf" {
      s4 \p \< s4
      s4 s4
      s4 \mp \> s4
      s4 s4 \!
      s4 \p s4
      s1 * 2/4
      s4 \< s4
      s4 s4
      s16 \mf s16 \p s8 s4 s4
      s2.
    }

    \new Staff = "LH" \relative c, {
      \set midiInstrument = #"piano"
      \clef "bass"
      \time 4/4
      cs4. cs8
      cs4. d8
      f4. a8
      f4. d8

      cs4. cs8
      d4 ds
      gs4. bf,8
      f'4 b,

      d4. d8 ~ d4
      ef2 f4
    }
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
