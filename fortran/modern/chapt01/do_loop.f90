program do_loop

  integer :: i = 0

  do 
    i = i + 1
    write(*, *) i
    if (mod(i, 6) == 0) EXIT
  end do

end program do_loop
