from django.urls import path
from . import views
urlpatterns = [  
      path('', views.index ,name ='index'),
      path('new_dojo',views.new_dojo),
      path('new_ninja',views.new_ninja_frompost)
         ]