time_loop: do n=1, num_time_steps     
dh(1) = h(1) - h(grid_size)     

doi=2,grid_size
  dh(i) = h(i) - h(i-1)      
  end do
  
do i=1, grid_size
  h(i) = h(i)-c*dh(i) / dx * dt     
end do

end do time_loop
