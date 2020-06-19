<?php

use Twig\Environment;
use Twig\Error\LoaderError;
use Twig\Error\RuntimeError;
use Twig\Markup;
use Twig\Sandbox\SecurityError;
use Twig\Sandbox\SecurityNotAllowedTagError;
use Twig\Sandbox\SecurityNotAllowedFilterError;
use Twig\Sandbox\SecurityNotAllowedFunctionError;
use Twig\Source;
use Twig\Template;

/* @FOSUser/Registration/register.html.twig */
class __TwigTemplate_0af35d14f93b6ed8fda47593dd833f9ef8162941a1e5aff87db2dfdc5ef24a14 extends \Twig\Template
{
    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->blocks = [
            'body' => [$this, 'block_body'],
        ];
    }

    protected function doGetParent(array $context)
    {
        // line 1
        return "BaseLogin.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@FOSUser/Registration/register.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@FOSUser/Registration/register.html.twig"));

        $this->parent = $this->loadTemplate("BaseLogin.html.twig", "@FOSUser/Registration/register.html.twig", 1);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 3
    public function block_body($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 4
        echo "<div class=\"login-box\">
    <div class=\"login-logo\">
        <a href=\"#\"><b>Study</b>NET</a>
    </div>
    <!-- /.login-logo -->
    <div class=\"card\">
        <div class=\"card-body login-card-body\">
            <p class=\"login-box-msg\">Sign in to start your session</p>
            ";
        // line 12
        echo         $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->renderBlock(($context["form"] ?? $this->getContext($context, "form")), 'form_start');
        echo "
            <div class=\"form-group has-feedback\">
                <input type=\"email\" id=\"email\" name=\"fos_user_registration_form[email]\"  required=\"required\" style=\"height: 30px\" autocomplete=\"username\" class=\"form-control\" placeholder=\"Email\">
                <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>
            </div>
            <input type=\"text\" id=\"username\" name=\"fos_user_registration_form[username]\"  required=\"required\" style=\"height: 30px\"autocomplete=\"username\" class=\"form-control\" placeholder=\"username\">
            <span class=\"glyphicon glyphicon-user form-control-feedback\"></span>

            <div class=\"form-group has-feedback\"></div>
            <div class=\"form-group has-feedback\">
                <input type=\"password\" id=\"password\" name=\"fos_user_registration_form[plainPassword][first]\" style=\"height: 30px\" required=\"required\" autocomplete=\"username\" class=\"form-control\" placeholder=\"password\">
                <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>
            </div>
            <div class=\"form-group has-feedback\">
                <input type=\"password\" id=\"password2\" name=\"fos_user_registration_form[plainPassword][second]\" style=\"height: 30px\" required=\"required\" autocomplete=\"username\" class=\"form-control\" placeholder=\"Confirmer password\">
                <span class=\"glyphicon glyphicon-log-in form-control-feedback\"></span>
            </div>
            <div class=\"row\">
                <!-- /.col -->
                <div class=\"col-xs-12\">
                    <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">Register</button>
                </div>
            </div>

            ";
        // line 36
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "_token", []), 'row');
        echo "
            ";
        // line 37
        echo         $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->renderBlock(($context["form"] ?? $this->getContext($context, "form")), 'form_end', ["render_rest" => false]);
        echo "
        </div>
    </div>

";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "@FOSUser/Registration/register.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  101 => 37,  97 => 36,  70 => 12,  60 => 4,  51 => 3,  29 => 1,);
    }

    /** @deprecated since 1.27 (to be removed in 2.0). Use getSourceContext() instead */
    public function getSource()
    {
        @trigger_error('The '.__METHOD__.' method is deprecated since version 1.27 and will be removed in 2.0. Use getSourceContext() instead.', E_USER_DEPRECATED);

        return $this->getSourceContext()->getCode();
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'BaseLogin.html.twig' %}

{% block body %}
<div class=\"login-box\">
    <div class=\"login-logo\">
        <a href=\"#\"><b>Study</b>NET</a>
    </div>
    <!-- /.login-logo -->
    <div class=\"card\">
        <div class=\"card-body login-card-body\">
            <p class=\"login-box-msg\">Sign in to start your session</p>
            {{ form_start(form) }}
            <div class=\"form-group has-feedback\">
                <input type=\"email\" id=\"email\" name=\"fos_user_registration_form[email]\"  required=\"required\" style=\"height: 30px\" autocomplete=\"username\" class=\"form-control\" placeholder=\"Email\">
                <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>
            </div>
            <input type=\"text\" id=\"username\" name=\"fos_user_registration_form[username]\"  required=\"required\" style=\"height: 30px\"autocomplete=\"username\" class=\"form-control\" placeholder=\"username\">
            <span class=\"glyphicon glyphicon-user form-control-feedback\"></span>

            <div class=\"form-group has-feedback\"></div>
            <div class=\"form-group has-feedback\">
                <input type=\"password\" id=\"password\" name=\"fos_user_registration_form[plainPassword][first]\" style=\"height: 30px\" required=\"required\" autocomplete=\"username\" class=\"form-control\" placeholder=\"password\">
                <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>
            </div>
            <div class=\"form-group has-feedback\">
                <input type=\"password\" id=\"password2\" name=\"fos_user_registration_form[plainPassword][second]\" style=\"height: 30px\" required=\"required\" autocomplete=\"username\" class=\"form-control\" placeholder=\"Confirmer password\">
                <span class=\"glyphicon glyphicon-log-in form-control-feedback\"></span>
            </div>
            <div class=\"row\">
                <!-- /.col -->
                <div class=\"col-xs-12\">
                    <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">Register</button>
                </div>
            </div>

            {{ form_row(form._token) }}
            {{ form_end(form, {'render_rest': false}) }}
        </div>
    </div>

{% endblock body %}
", "@FOSUser/Registration/register.html.twig", "C:\\wamp64\\www\\Lite\\app\\Resources\\FOSUserBundle\\views\\Registration\\register.html.twig");
    }
}
