program do_loop

  integer :: i = 0
  integer :: j = 1

  do 
    i = i + 1
    j = j + 1
    write(*, *) i
    if (mod(i, 6) == 0) EXIT
  end do

end program do_loop
