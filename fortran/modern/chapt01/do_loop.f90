program do_loop

  implicit none

  real :: i, j
  real, parameter :: m=2

  outer_loop: do j=1, jm    
    inner_loop: do i=1, im     
      print *, 'i, j =', i, j      
    end do inner_loop           
  end do outer_loop

end program do_loop
