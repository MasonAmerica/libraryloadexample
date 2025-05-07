cmake_minimum_required(VERSION 3.4.1)

project(NativeOpensslTest)

add_library(dlopentest SHARED DlopenTest.cpp)

find_library(log-lib log)

target_link_libraries(dlopentest ${log-lib})
