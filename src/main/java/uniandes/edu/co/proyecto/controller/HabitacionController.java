package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import uniandes.edu.co.proyecto.repositorio.HabitacionRepository;
import uniandes.edu.co.proyecto.modelo.Habitacion;
@Controller
public class HabitacionController{

    // @Autowired
    // private HabitacionRepository habitacionRepository;

    // @GetMapping("/habitaciones")
    // public String habitaciones(Model model) {

    //     model.addAttribute("habitaciones", habitacionRepository.darHabitaciones());
    //     return "habitaciones";

    // }

    // @GetMapping("/habitaciones/new")
    // public String habitacionForm(Model model) {
    //     model.addAttribute("habitacion", new Habitacion());
    //     return "habitacionNuevo";
    // }
    
    // @GetMapping("/habitaciones/new/save")
    // public String habitacionGuardar(Habitacion habitacion) {
    //     habitacionRepository.insertarHabitacion(habitacion.getTipo(), habitacion.getCapacidad(), habitacion.getCosto(), habitacion.getEstado());
    //     return "redirect:/habitaciones";
    // }

    // @GetMapping("/habitaciones/{id}/edit")
    // public String habitacionEditarForm(@PathVariable("id") Integer id, Model model) {
    //     Habitacion habitacion = habitacionRepository.darHabitacion(id);
    //     if (habitacion != null) {
    //         model.addAttribute("habitacion", habitacion);
    //         return "habitacionEditar";
    //     } else {
    //         return "redirect:/habitaciones";
    //     }
    // }

    // @GetMapping("/habitaciones/{id}/edit/save")
    // public String habitacionEditarGuardar(@PathVariable("id") Integer id, Habitacion habitacion) {
    //     habitacionRepository.actualizarHabitacion(id, habitacion.getTipo(), habitacion.getCapacidad(), habitacion.getCosto(), habitacion.getEstado());
    //     return "redirect:/habitaciones";
    // }
    // @GetMapping("/habitaciones/{id}/delete")
    // public String habitacionEliminar(@PathVariable("id") Integer id) {
    //     habitacionRepository.eliminarHabitacion(id);
    //     return "redirect:/habitaciones";
    // }


    
    }