@echo off
color 2

echo R1(conf)#router ospf 1
echo.
echo R1(conf-router) # network 172.30.0.1 0.0.0.0 area 0         (A)
echo.
echo R1(conf-router)# router-id 1.1.1.1
echo.
echo R1(conf)#redistribute static  subnets metric 200 metric-type 2
echo.
echo R2(conf)#router ospf 1
echo.
echo R2(config-router)#network 172.30.0.2  0.0.0.0 area 0
echo.
echo R2(config-router)#router-id 2.2.2.2       (B)
echo.
echo R2(config-router)#network 172.30.10.2 0.0.0.0 area 10
echo.
:End
cmd /k
