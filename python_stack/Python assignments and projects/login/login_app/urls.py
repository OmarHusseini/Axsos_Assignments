from django.urls import path
from . import views
urlpatterns = [ path('', views.index ,name ='index'), 
               path('new_reg',views.new_register),
               path('login',views.login),
               path('success',views.success_page),
               path('logout',views.log_out)
               
              ]