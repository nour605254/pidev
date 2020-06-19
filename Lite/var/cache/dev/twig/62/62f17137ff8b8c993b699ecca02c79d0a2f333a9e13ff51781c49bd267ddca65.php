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

/* @Event/Event/new.html.twig */
class __TwigTemplate_aab4ad28da11dfa06e0bff4a14120b4d140a7821403af61f11092624be710a5a extends \Twig\Template
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
        return "baseAdmin.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/new.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/new.html.twig"));

        $this->parent = $this->loadTemplate("baseAdmin.html.twig", "@Event/Event/new.html.twig", 1);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 2
    public function block_body($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 3
        echo "    <h1>Creation d'un évènement </h1>
<div style=\"width:75%; margin: auto\">
    <input type=\"hidden\" value=\"";
        // line 5
        echo twig_escape_filter($this->env, ($context["dt"] ?? $this->getContext($context, "dt")), "html", null, true);
        echo "\" id=\"dtNow\">
";
        // line 6
        echo         $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->renderBlock(($context["form"] ?? $this->getContext($context, "form")), 'form_start');
        echo "

    ";
        // line 9
        echo "
        <div class=\"form-group col-md-6\">
            <label for=\"inputEmail4\">";
        // line 11
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "titre", []), 'label');
        echo "</label>
            ";
        // line 12
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "titre", []), 'widget');
        echo "
        </div>

    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 16
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "dateDebutEvent", []), 'label');
        echo "</label>
        ";
        // line 17
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "dateDebutEvent", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "
        <span id=\"dbs\" style=\"color:red\"></span>

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 22
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "dateFEvent", []), 'label');
        echo "</label>
        ";
        // line 23
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "dateFEvent", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "
    </div>



    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 29
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "adresseEvent", []), 'label');
        echo "</label>
        ";
        // line 30
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "adresseEvent", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 34
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "image", []), 'label');
        echo "</label>
        ";
        // line 35
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "image", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 39
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "nbP", []), 'label');
        echo "</label>
        ";
        // line 40
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "nbP", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 44
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "typeEvent", []), 'label');
        echo "</label>
        ";
        // line 45
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "typeEvent", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 49
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "description", []), 'label');
        echo "</label>
        ";
        // line 50
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "description", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>

    <input type=\"submit\" value=\"Create\"  class=\"btn btn-success\">
    ";
        // line 55
        echo         $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->renderBlock(($context["form"] ?? $this->getContext($context, "form")), 'form_end');
        echo "
</div>
    <hr>


    <ul>
        <li>
            <a href=\"";
        // line 62
        echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("event_list");
        echo "\">Back to the list</a>
        </li>
    </ul>
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "@Event/Event/new.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  179 => 62,  169 => 55,  161 => 50,  157 => 49,  150 => 45,  146 => 44,  139 => 40,  135 => 39,  128 => 35,  124 => 34,  117 => 30,  113 => 29,  104 => 23,  100 => 22,  92 => 17,  88 => 16,  81 => 12,  77 => 11,  73 => 9,  68 => 6,  64 => 5,  60 => 3,  51 => 2,  29 => 1,);
    }

    /** @deprecated since 1.27 (to be removed in 2.0). Use getSourceContext() instead */
    public function getSource()
    {
        @trigger_error('The '.__METHOD__.' method is deprecated since version 1.27 and will be removed in 2.0. Use getSourceContext() instead.', E_USER_DEPRECATED);

        return $this->getSourceContext()->getCode();
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'baseAdmin.html.twig' %}
{% block body %}
    <h1>Creation d'un évènement </h1>
<div style=\"width:75%; margin: auto\">
    <input type=\"hidden\" value=\"{{ dt }}\" id=\"dtNow\">
{{ form_start(form) }}

    {#{{ form_widget(form) }}#}

        <div class=\"form-group col-md-6\">
            <label for=\"inputEmail4\">{{ form_label(form.titre) }}</label>
            {{ form_widget(form.titre) }}
        </div>

    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">{{ form_label(form.dateDebutEvent) }}</label>
        {{ form_widget(form.dateDebutEvent,{'attr':{'class':'form-control'}}) }}
        <span id=\"dbs\" style=\"color:red\"></span>

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">{{ form_label(form.dateFEvent) }}</label>
        {{ form_widget(form.dateFEvent,{'attr':{'class':'form-control'}}) }}
    </div>



    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">{{ form_label(form.adresseEvent) }}</label>
        {{ form_widget(form.adresseEvent,{'attr':{'class':'form-control'}}) }}

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">{{ form_label(form.image) }}</label>
        {{ form_widget(form.image,{'attr':{'class':'form-control'}}) }}

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">{{ form_label(form.nbP) }}</label>
        {{ form_widget(form.nbP,{'attr':{'class':'form-control'}}) }}

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">{{ form_label(form.typeEvent) }}</label>
        {{ form_widget(form.typeEvent,{'attr':{'class':'form-control'}}) }}

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">{{ form_label(form.description) }}</label>
        {{ form_widget(form.description,{'attr':{'class':'form-control'}}) }}

    </div>

    <input type=\"submit\" value=\"Create\"  class=\"btn btn-success\">
    {{ form_end(form) }}
</div>
    <hr>


    <ul>
        <li>
            <a href=\"{{ path('event_list') }}\">Back to the list</a>
        </li>
    </ul>
{% endblock %}
", "@Event/Event/new.html.twig", "C:\\wamp64\\www\\Lite1\\src\\EventBundle\\Resources\\views\\Event\\new.html.twig");
    }
}
