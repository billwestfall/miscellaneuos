program do_loop

  implicit none

  real :: i, j

  outer_loop: doj=1,jm    
    inner_loop: doi=1,im     
      print *, 'i,j=',i,j      
    end do inner_loop           
  end do outer_loop

end program do_loop
