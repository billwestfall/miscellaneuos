integer, parameter :: icenter = 25     
real, parameter :: decay = 0.02        

doi=1,grid_size                     
  h(i) = exp(-decay * (i - icenter)**2)     
end do
