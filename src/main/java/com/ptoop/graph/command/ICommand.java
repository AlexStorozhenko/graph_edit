package com.ptoop.graph.command;

import com.ptoop.graph.model.BaseFigure;

/**
 * @author: Alexey Storozhenko
 * @since: 11.03.2018
 */
public interface ICommand<T extends BaseFigure> {
    T execute();
}
