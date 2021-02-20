program tsunami

  implicit none        

  integer :: i, n             
  integer :: grid_size        
  integer :: num_time_steps   

!  real :: dt ! time step [s]      
!  real :: dx ! grid spacing [m]   
!  real :: c ! phase speed [m/s]     
 
!  dt = 1.
!  dx = 1.
!  c=1.
  
  integer, parameter :: grid_size = 100 
  integer, parameter :: num_time_steps = 100
  
  real, parameter :: dt = 1, dx = 1,c=1

end program tsunami
