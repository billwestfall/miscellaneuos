program do_loop

  integer :: i = 0
  INTEGER :: x(5) = (/ 1, 2, 3, 4 ,5 /)
  print *, SUM(x)                        ! all elements, sum = 15
  print *, SUM(x, MASK=MOD(x, 2)==1)     ! odd elements, sum = 9
  
  do 
    i = i + 1
    write(*, *) i
    if (mod(i, 6) == 0) EXIT
  end do

end program do_loop
