program do_loop

  INTEGER :: i = 0

  DO 
    i = i + 1
    WRITE(*, *) i
    IF (MOD(i, 6) == 0) EXIT
  END DO

end program do_loop
