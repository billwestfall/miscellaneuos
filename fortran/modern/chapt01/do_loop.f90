program do_loop

  implicit none

  real, parameter :: i=2
  real, parameter :: j=3
  real, parameter :: m=4

  do j, j*m    
    do i, i*m     
      print *, 'i, j =', i, j      
    end do          
  end do

end program do_loop
