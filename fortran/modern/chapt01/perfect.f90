program do_loop

  integer :: i = 0
  integer :: x(5) = (/ 1, 2, 3, 4 ,5 /)
  print *, sum(x)                        ! all elements, sum = 15
  print *, sum(x, mask=mod(x, 2)==1)     ! odd elements, sum = 9
  
  do 
    i = i + 1
    write(*, *) i
    if (mod(i, 6) == 0) EXIT
  end do

end program do_loop
