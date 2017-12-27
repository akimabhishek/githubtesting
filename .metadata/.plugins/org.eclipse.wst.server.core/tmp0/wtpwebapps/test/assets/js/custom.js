$(document).ready(function () {
  $('#asbd_menutitle').on('click', function() {
    $(this).find('.slide-arrow').toggleClass('rotate')
    $('.submenushow').slideToggle();
  });
});
