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

/* @Event/Event/edit.html.twig */
class __TwigTemplate_2c75a83d7167a8625e5ea79d2ddf5142e236c943f9d0074a71038898fceb6bf8 extends \Twig\Template
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
        // line 3
        return "baseAdmin.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/edit.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/edit.html.twig"));

        $this->parent = $this->loadTemplate("baseAdmin.html.twig", "@Event/Event/edit.html.twig", 3);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 4
    public function block_body($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 5
        echo "    <h1> Modification d'un évenement </h1>
<div style=\"width:75%; margin: auto\">
   ";
        // line 8
        echo "    ";
        echo         $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->renderBlock(($context["form"] ?? $this->getContext($context, "form")), 'form_start');
        echo "

    ";
        // line 11
        echo "
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 13
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "titre", []), 'label');
        echo "</label>
        ";
        // line 14
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "titre", []), 'widget');
        echo "
    </div>

    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 18
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "dateDebutEvent", []), 'label');
        echo "</label>
        ";
        // line 19
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "dateDebutEvent", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "
        <span id=\"dbs\" style=\"color:red\"></span>

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 24
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "dateFEvent", []), 'label');
        echo "</label>
        ";
        // line 25
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "dateFEvent", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "
    </div>



    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 31
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "adresseEvent", []), 'label');
        echo "</label>
        ";
        // line 32
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "adresseEvent", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 36
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "image", []), 'label');
        echo "</label>
        ";
        // line 37
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "image", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 41
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "nbP", []), 'label');
        echo "</label>
        ";
        // line 42
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "nbP", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 46
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "typeEvent", []), 'label');
        echo "</label>
        ";
        // line 47
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "typeEvent", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>
    <div class=\"form-group col-md-6\">
        <label for=\"inputEmail4\">";
        // line 51
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "description", []), 'label');
        echo "</label>
        ";
        // line 52
        echo $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->searchAndRenderBlock($this->getAttribute(($context["form"] ?? $this->getContext($context, "form")), "description", []), 'widget', ["attr" => ["class" => "form-control"]]);
        echo "

    </div>

    <input type=\"submit\" value=\"Modifier\"  class=\"btn btn-success\">
    ";
        // line 57
        echo         $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->renderBlock(($context["form"] ?? $this->getContext($context, "form")), 'form_end');
        echo "
</div>
<hr>


<ul>
    <li>
        <a href=\"";
        // line 64
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
        return "@Event/Event/edit.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  176 => 64,  166 => 57,  158 => 52,  154 => 51,  147 => 47,  143 => 46,  136 => 42,  132 => 41,  125 => 37,  121 => 36,  114 => 32,  110 => 31,  101 => 25,  97 => 24,  89 => 19,  85 => 18,  78 => 14,  74 => 13,  70 => 11,  64 => 8,  60 => 5,  51 => 4,  29 => 3,);
    }

    /** @deprecated since 1.27 (to be removed in 2.0). Use getSourceContext() instead */
    public function getSource()
    {
        @trigger_error('The '.__METHOD__.' method is deprecated since version 1.27 and will be removed in 2.0. Use getSourceContext() instead.', E_USER_DEPRECATED);

        return $this->getSourceContext()->getCode();
    }

    public function getSourceContext()
    {
        return new Source("

{% extends 'baseAdmin.html.twig' %}
{% block body %}
    <h1> Modification d'un évenement </h1>
<div style=\"width:75%; margin: auto\">
   {#<input type=\"hidden\" value=\"{{ dt }}\" id=\"dtNow\">#}
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

    <input type=\"submit\" value=\"Modifier\"  class=\"btn btn-success\">
    {{ form_end(form) }}
</div>
<hr>


<ul>
    <li>
        <a href=\"{{ path('event_list') }}\">Back to the list</a>
    </li>
</ul>

{% endblock %}




{#
{% extends 'baseAdmin.html.twig' %}
{% block body %}
    <h1> Modification d'un évenement </h1>
    <div style=\"width:75%; margin: auto\">
        {{ form_start(form) }}

        #}
{#{{ form_widget(form) }}#}{#


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
       {{ form_widget(form.image)}}

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

        <input type=\"submit\" value=\"Modifier\"  class=\"btn btn-success\">
        {{ form_end(form) }}
    </div>

    <hr>


    <ul>
        <li>
            <a href=\"{{ path('event_list') }}\">Back to the list</a>
        </li>
    </ul>



{% endblock %}
#}




", "@Event/Event/edit.html.twig", "C:\\wamp64\\www\\Lite1\\src\\EventBundle\\Resources\\views\\Event\\edit.html.twig");
    }
}
