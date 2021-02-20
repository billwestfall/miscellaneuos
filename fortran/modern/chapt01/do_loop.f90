program do_loop

  implicit none

  real, parameter :: i=2
  real, parameter :: j=3
  real, parameter :: m=4

  outer_loop: do j, j*m    
    inner_loop: do i, i*m     
      print *, 'i, j =', i, j      
    end do inner_loop           
  end do outer_loop

end program do_loop
