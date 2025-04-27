from django.urls import path
from . import views

urlpatterns = [ path('', views.index ,name ='index'), 
                path('shows/new',views.create),
                path('add_new',views.add_new_show),
                path('edit/<int:tv_id>',views.edit_show),
                path('show_detail/<int:tv_id>',views.show_detail),
                path('update/<int:tv_id>',views.update_page),
                path('delete/<int:tv_id>',views.delete_show)
                ]
