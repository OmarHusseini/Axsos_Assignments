from django.urls import path
from . import views
urlpatterns = [
    path('', views.index ,name ='index'), 
    path('addtwo',views.addtwo),

    path('destroy_session',views.destroy)
     ]