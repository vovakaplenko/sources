package org.jenkinsci.plugins.pipeline.modeldefinition.ast;

import org.jenkinsci.plugins.pipeline.modeldefinition.validator.ModelValidator;

import javax.annotation.Nonnull;

/**
 * A single job property, corresponding eventually to {@code JobProperty} or DeclarativeOption.
 *
 * @author Andrew Bayer
 */
public class ModelASTOption extends ModelASTMethodCall {
    public ModelASTOption(Object sourceLocation) {
        super(sourceLocation);
    }

    @Override
    public void validate(@Nonnull final ModelValidator validator) {
        validator.validateElement(this);
        super.validate(validator);
    }

    @Override
    public String toString() {
        return "ModelASTOption{"+super.toString()+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        return true;

    }
}
