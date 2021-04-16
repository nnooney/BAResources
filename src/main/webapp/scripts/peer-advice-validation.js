$(document).ready(function () {

  $("#peer-form").on("submit", function(e) {
    // assume the form is valid by default
    var valid = true;
    
    // username validation
    if ( $("#user-name").prop("validity").valid ) {
      $("#username_error").addClass("hidden");
    } else {
      $("#username_error").removeClass("hidden");
      valid = false;
    }

    // university validation
    if ( $("#university").prop("validity").valid ) {
      $("#university_error").addClass("hidden");
    } else {
      $("#university_error").removeClass("hidden");
      valid = false;
    }

    // major validation
    if ( $("#major").prop("validity").valid ) {
      $("#major_error").addClass("hidden");
    } else {
      $("#major_error").removeClass("hidden");
      valid = false;
    }

    // grade validation
    if ( $("#freshman").is(':checked')
    || $("#sophomore").is(':checked')
    || $("#junior").is(':checked')
    || $("#senior").is(':checked')) {

      $("#grade_error").addClass("hidden");
    } else {
      $("#grade_error").removeClass("hidden");
      valid = false;
    }

    // advice validation
    if ( $("#advice").prop("validity").valid ) {
      $("#advice_error").addClass("hidden");
    } else {
      $("#advice_error").removeClass("hidden");
      valid = false;
    }
    if (valid == false) {
        e.preventDefault();
    }

    return valid;

    
    });
  });
